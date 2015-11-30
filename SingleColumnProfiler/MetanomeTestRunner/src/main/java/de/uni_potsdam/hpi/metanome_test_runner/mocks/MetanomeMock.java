package de.uni_potsdam.hpi.metanome_test_runner.mocks;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.metanome.algorithm_integration.AlgorithmExecutionException;
import de.metanome.algorithm_integration.configuration.ConfigurationSettingFileInput;
import de.metanome.algorithm_integration.input.RelationalInputGenerator;
import de.metanome.algorithm_integration.results.BasicStatistic;
import de.metanome.algorithm_integration.results.Result;
import de.metanome.algorithms.singlecolumnprofiler.SingleColumnProfiler;
import de.metanome.algorithms.singlecolumnprofiler.SingleColumnProfilerAlgorithm;
import de.metanome.backend.input.file.DefaultFileInputGenerator;
import de.metanome.backend.result_receiver.ResultCache;
import de.uni_potsdam.hpi.metanome_test_runner.config.Config;
import de.uni_potsdam.hpi.metanome_test_runner.utils.FileUtils;

public class MetanomeMock {

	public static void execute(Config conf) {
		try {
			RelationalInputGenerator inputGenerator = new DefaultFileInputGenerator(new ConfigurationSettingFileInput(
					conf.inputFolderPath + conf.inputDatasetName + conf.inputFileEnding, true,
					conf.inputFileSeparator, conf.inputFileQuotechar, conf.inputFileEscape, conf.inputFileStrictQuotes, 
					conf.inputFileIgnoreLeadingWhiteSpace, conf.inputFileSkipLines, conf.inputFileHasHeader, conf.inputFileSkipDifferingLines, conf.inputFileNullString));
			
			ResultCache resultReceiver = new ResultCache("MetanomeMock");
			
			SingleColumnProfiler algorithm = new SingleColumnProfiler();
			algorithm.setRelationalInputConfigurationValue(SingleColumnProfiler.Identifier.INPUT_GENERATOR.name(), inputGenerator);
			algorithm.setResultReceiver(resultReceiver);
			
			long time = System.currentTimeMillis();
			algorithm.execute();
			time = System.currentTimeMillis() - time;
			  System.out.println("time ..."+time);
	            
			if (conf.writeResults) {
				String outputPath = conf.measurementsFolderPath + conf.inputDatasetName + "_" + algorithm.getClass().getSimpleName() + File.separator;
                List<Result> results = null;
                if (resultReceiver instanceof ResultCache)
                    results = ((ResultCache)resultReceiver).fetchNewResults();
                else
                    results = new ArrayList<>();
                
                System.out.println("Writing run configuration ...");
            
				FileUtils.writeToFile(
						algorithm.toString() + "\r\n\r\n" + 
						"Runtime: " + time + "\r\n\r\n" + 
						"Results: " + results.size() + "\r\n\r\n" + 
						conf.toString(), outputPath + conf.statisticsFileName);
				System.out.println("Writing results ...");
				
				for (Result result : results) {
				BasicStatistic od = (BasicStatistic) result;
	            FileUtils.writeToFile(format(results), outputPath + conf.resultFileName);
				}
				

			}
		}
		catch (AlgorithmExecutionException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String format(List<Result> results) {
		StringBuilder builder = new StringBuilder();
		for (Result result : results) {
			BasicStatistic od = (BasicStatistic) result;
			builder.append(od.getStatisticValue().toString()+ "\r\n");
		}
		return builder.toString();
	}
}
