package com.blackbaud.socialsharing;

import com.blackbaud.socialsharing.resources.UserActionResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends Application<SocialSharingConfiguration>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) throws Exception
    {
        new App().run(args);
    }

	@Override
	public void initialize(Bootstrap<SocialSharingConfiguration> configurationBootstrap)
	{

	}

	@Override
	public void run(SocialSharingConfiguration configuration, Environment environment) throws Exception
	{
		LOGGER.info("Method App#run() called");
		environment.jersey().register(new UserActionResource());
	}
}
