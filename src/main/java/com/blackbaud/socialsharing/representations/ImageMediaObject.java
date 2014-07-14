package com.blackbaud.socialsharing.representations;

import org.hibernate.validator.constraints.NotBlank;

import java.net.URL;

/**
* Created by jbodnar on 7/11/14.
*/
public class ImageMediaObject implements MediaObject
{
	@NotBlank
	private URL source;
	private URL link;

	public URL getSource()
	{
		return source;
	}

	public URL getLink()
	{
		return link;
	}
}
