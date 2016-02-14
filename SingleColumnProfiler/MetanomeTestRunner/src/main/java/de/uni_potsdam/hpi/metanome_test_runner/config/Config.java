package de.uni_potsdam.hpi.metanome_test_runner.config;

import java.io.File;

public class Config {

    public enum Algorithm {
        SingleColumnProfiler
    }
    
    public enum Dataset {
      RECORDING,ARTIST,EDIT
    }
    
    public String[] inputTableNames = {
        "annotation",
        "area",
        "area_alias",
        "area_alias_type",
        "area_annotation",
        "area_gid_redirect",
        "area_tag",
        "area_type",
        "artist",
        "artist_alias",
        "artist_alias_type",
        "artist_annotation",
        "artist_credit",
        "artist_credit_name",
        "artist_gid_redirect",
        "artist_ipi",
        "artist_isni",
        "artist_meta",
        "artist_tag",
        "artist_type",
        "cdtoc",
        "cdtoc_raw",
        "country_area",
        "cover_art_archive.art_type",
        "cover_art_archive.cover_art",
        "cover_art_archive.cover_art_type",
        "cover_art_archive.image_type",
        "cover_art_archive.release_group_cover_art", 
        "documentation.l_area_area_example",
        "documentation.l_area_url_example",
        "documentation.l_area_work_example",
        "documentation.l_artist_artist_example",
        "documentation.l_artist_event_example",
        "documentation.l_artist_label_example",
        "documentation.l_artist_place_example",
        "documentation.l_artist_recording_example",
        "documentation.l_artist_release_example",
        "documentation.l_artist_release_group_example",
        "documentation.l_artist_url_example",
        "documentation.l_artist_work_example",
        "documentation.l_event_release_group_example",
        "documentation.l_label_label_example",
        "documentation.l_label_release_example",
        "documentation.l_label_url_example",
        "documentation.l_place_place_example",
        "documentation.l_place_recording_example",
        "documentation.l_place_release_group_example",
        "documentation.l_place_url_example",
        "documentation.l_place_work_example",
        "documentation.l_recording_recording_example",
        "documentation.l_recording_url_example",
        "documentation.l_recording_work_example",
        "documentation.l_release_group_release_group_example",
        "documentation.l_release_group_series_example",
        "documentation.l_release_group_url_example",
        "documentation.l_release_release_example",
        "documentation.l_release_url_example",
        "documentation.l_url_work_example",
        "documentation.l_work_work_example",
        "documentation.link_type_documentation",
        "edit",
        "edit_area",
        "edit_artist",
        "edit_event",
        "edit_instrument",
        "edit_label",
        "edit_note",
        "edit_place",
        "edit_recording",
        "edit_release",
        "edit_release_group",
        "edit_series",
        "edit_url",
        "edit_work",
        "editor_collection_type",
        "editor_sanitised",
        "event",
        "event_alias",
        "event_alias_type",
        "event_annotation",
        "event_gid_redirect",
        "event_tag",
        "event_type",
        "gender",
        "instrument",
        "instrument_alias",
        "instrument_alias_type",
        "instrument_annotation",
        "instrument_gid_redirect",
        "instrument_tag",
        "instrument_type",
        "iso_3166_1",
        "iso_3166_2",
        "iso_3166_3",
        "isrc",
        "iswc",  
        "l_area_area",
        "l_area_event",
        "l_area_instrument",
        "l_area_recording",
        "l_area_release",
        "l_area_url",
        "l_area_work", 
        "l_artist_artist",
        "l_artist_event",
        "l_artist_label",
        "l_artist_place",
        "l_artist_recording",
        "l_artist_release",
        "l_artist_release_group",
        "l_artist_series",
        "l_artist_url",
        "l_artist_work", 
        "l_event_event",
        "l_event_place", 
        "l_event_recording",
        "l_event_release",
        "l_event_release_group",
        "l_event_series",
        "l_event_url",
        "l_event_work",
        "l_instrument_instrument",
        "l_instrument_url",
        "l_label_label",
        "l_label_recording",
        "l_label_release",
        "l_label_url",
        "l_label_work",
        "l_place_place",
        "l_place_recording",
        "l_place_release",
        "l_place_url",
        "l_place_work",
        "l_recording_recording",
        "l_recording_release",
        "l_recording_series",
        "l_recording_url",
        "l_recording_work",
        "l_release_group_release_group",
        "l_release_group_series",
        "l_release_group_url",
        "l_release_release",
        "l_release_series",
        "l_release_url",
        "l_series_series",
        "l_series_url",
        "l_series_work",
        "l_url_work",
        "l_work_work",
        "label",
        "label_alias",
        "label_alias_type",
        "label_annotation",
        "label_gid_redirect",
        "label_ipi",
        "label_isni",
        "label_meta",
        "label_tag",
        "label_type",
        "language",
        "link",
        "link_attribute",
        "link_attribute_credit",
        "link_attribute_text_value",
        "link_attribute_type",
        "link_creditable_attribute_type",
        "link_text_attribute_type",
        "link_type",
        "link_type_attribute_type",
        "medium",
        "medium_cdtoc",
        "medium_format",
        "medium_index",
        "orderable_link_type", 
        "place",
        "place_alias",
        "place_alias_type",
        "place_annotation",
        "place_gid_redirect",
        "place_tag",
        "place_type",
        "recording",
        "recording_alias",
        "recording_alias_type",
        "recording_annotation",
        "recording_gid_redirect",
        "recording_meta",
        "recording_tag",
        "release",
        "release_alias",
        "release_alias_type",
        "release_annotation",
        "release_country",
        "release_gid_redirect",
        "release_label",
        "release_meta",
        "release_packaging",
        "release_raw",
        "release_status",
        "release_tag",
        "release_unknown_country",
        "release_group",
        "release_group_alias",
        "release_group_alias_type",
        "release_group_annotation",
        "release_group_gid_redirect",
        "release_group_meta",
        "release_group_primary_type",
        "release_group_secondary_type",
        "release_group_secondary_type_join",
        "release_group_tag",
        "replication_control",
        "script",
        "series",
        "series_alias",
        "series_alias_type",
        "series_annotation",
        "series_gid_redirect",
        "series_ordering_type",
        "series_tag",
        "series_type",
        "sitemaps.artist_lastmod",
        "sitemaps.control",
        "sitemaps.label_lastmod",
        "sitemaps.place_lastmod",
        "sitemaps.recording_lastmod",
        "sitemaps.release_group_lastmod",
        "sitemaps.release_lastmod",
        "sitemaps.work_lastmod",
        "statistics.statistic",
        "statistics.statistic_event",
        "tag",
        "tag_relation",
        "track",
        "track_gid_redirect",
        "track_raw",
        "url",
        "url_gid_redirect",
        "vote", 
        "wikidocs.wikidocs_index",
        "work",
        "work_alias",
        "work_alias_type",
        "work_annotation",
        "work_attribute",
        "work_attribute_type",
        "work_attribute_type_allowed_value",
        "work_gid_redirect",
        "work_meta",
        "work_tag",
        "work_type"    };
    
    public Config.Algorithm algorithm;
    public Config.Dataset dataset;
    
    public String inputDatasetName;
    public String inputFolderPath = "data" + File.separator;
    public String inputFileEnding = ".csv";
//    public char inputFileSeparator = '\t';
//    public char inputFileQuotechar = '\0';
//    public char inputFileEscape = '\0';
    public char inputFileSeparator = ',';
    public char inputFileQuotechar = '\'';
    public char inputFileEscape = '\\';
    public int inputFileSkipLines = 0;
    public boolean inputFileStrictQuotes = false;
    public boolean inputFileIgnoreLeadingWhiteSpace = false;
    public boolean inputFileHasHeader = true;
    public boolean inputFileSkipDifferingLines = false;
    public String inputFileNullString = " ";
   
    public String measurementsFolderPath = "io" + File.separator + "measurements" + File.separator;
    
    public String statisticsFileName = "statistics.txt";
    public String resultFileName = "results.txt";
    
    public boolean writeResults = true;
    
    public Config() {
        this(Config.Algorithm.SingleColumnProfiler, Config.Dataset.ARTIST);
    }

    public Config(Config.Algorithm algorithm, Config.Dataset dataset) {
        this.algorithm = algorithm;
        this.setDataset(dataset);
    }

    @Override
    public String toString() {
        return "Config:\r\n\t" +
            "algorithm: " + this.algorithm.name() + "\r\n\t" +
            "dataset: " + this.inputDatasetName + this.inputFileEnding;
    }

    private void setDataset(Config.Dataset dataset) {
        this.dataset = dataset;
        switch (dataset) {
          case RECORDING:
            this.inputDatasetName = "MB_recording";
   
            break;
            case ARTIST:
            this.inputDatasetName = "WDC_planets";
            break;
            
            case EDIT:
              this.inputDatasetName = "MB_edit";
              break;
                   }
    }
}
