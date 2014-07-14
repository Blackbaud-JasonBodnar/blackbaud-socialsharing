package com.blackbaud.socialsharing.representations;

import org.hibernate.validator.constraints.NotBlank;

import java.net.URL;

/**
* Created by jbodnar on 7/11/14.
*/
public class FlashMediaObject implements MediaObject
{
	@NotBlank
	private URL source;
	private int width;
	private int height;
	private URL previewImageURL;
	private int previewImageWidth;
	private int previewImageHeight;

	public URL getSource()
	{
		return source;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public URL getPreviewImageURL()
	{
		return previewImageURL;
	}

	public int getPreviewImageWidth()
	{
		return previewImageWidth;
	}

	public int getPreviewImageHeight()
	{
		return previewImageHeight;
	}
}
