/**
 * 
 */
package ca.datamagic.accounting.servlet;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author gregm
 *
 */
public class AccountingContextListener implements ServletContextListener {
	private static final Logger logger = Logger.getLogger(AccountingContextListener.class.getName());
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("contextInitialized");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("contextDestroyed");
	}
}
