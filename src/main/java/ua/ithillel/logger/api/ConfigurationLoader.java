package ua.ithillel.logger.api;

import ua.ithillel.logger.service.LoggerConfiguration;

/**
 * @author Podvorchan Ruslan 08.11.2022
 */
public interface ConfigurationLoader {

  LoggerConfiguration load();

}
