package dataProviders;

import utils.ConfigManager;

public class FileReaderManager {
        private static FileReaderManager fileReaderManager = new FileReaderManager();
        private static ConfigManager configManager;
        private FileReaderManager() {
        }
        public static FileReaderManager getInstance( ) {
            return fileReaderManager;
        }
        public ConfigManager getConfigReader() {
            return (configManager == null) ? new ConfigManager() : configManager;
        }

    }


