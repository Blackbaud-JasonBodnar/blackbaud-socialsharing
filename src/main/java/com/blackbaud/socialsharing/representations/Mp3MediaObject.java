package com.blackbaud.socialsharing.representations;

import org.hibernate.validator.constraints.NotBlank;

import java.net.URL;

/**
* Created by jbodnar on 7/11/14.
*/
public class Mp3MediaObject implements MediaObject
{
	@NotBlank
	private URL source;
	private String title;
	private String artist;
	private String album;

	public URL getSource()
	{
		return source;
	}

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	public String getAlbum()
	{
		return album;
	}
}
