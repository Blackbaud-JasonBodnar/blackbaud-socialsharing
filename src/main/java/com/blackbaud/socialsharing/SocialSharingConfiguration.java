package com.blackbaud.socialsharing;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by jbodnar on 7/10/14.
 */
public class SocialSharingConfiguration extends Configuration
{
	@JsonProperty
	@NotEmpty
	private String gigyaAPIKey;
	@JsonProperty
	@NotEmpty
	private String gigyaSecretKey;

	public String getGigyaAPIKey()
	{
		return gigyaAPIKey;
	}

	public String getGigyaSecretKey()
	{
		return gigyaSecretKey;
	}
}
