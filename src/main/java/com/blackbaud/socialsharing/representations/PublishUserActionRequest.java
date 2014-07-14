package com.blackbaud.socialsharing.representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

import java.net.URL;

/**
 * Created by jbodnar on 7/11/14.
 */
public class PublishUserActionRequest
{
	@NotBlank
	private String uid;
	private String apiKey;
	private String secretKey;
	private String actionTitle;
	private URL actionLink;
	private String userMessage;
	private String title;
	private String subTitle;
	private String description;
	private URL linkBack;
	private MediaObject mediaObject;

	public PublishUserActionRequest()
	{
	}

	@JsonCreator
	public PublishUserActionRequest(
		@JsonProperty("uid") String uid,
		@JsonProperty("apiKey") String apiKey,
		@JsonProperty("secretKey") String secretKey,
		@JsonProperty("actionTitle") String actionTitle,
		@JsonProperty("actionLink") URL actionLink,
		@JsonProperty("userMessage") String userMessage,
		@JsonProperty("title") String title,
		@JsonProperty("subTitle") String subTitle,
		@JsonProperty("description") String description,
		@JsonProperty("linkBack") URL linkBack,
		@JsonProperty("mediaObject") MediaObject mediaObject
	)
	{
		this.uid = uid;
		this.apiKey = apiKey;
		this.secretKey = secretKey;
		this.actionTitle = actionTitle;
		this.actionLink = actionLink;
		this.userMessage = userMessage;
		this.title = title;
		this.subTitle = subTitle;
		this.description = description;
		this.linkBack = linkBack;
		this.mediaObject = mediaObject;
	}

	public String getUid()
	{
		return uid;
	}

	public String getApiKey()
	{
		return apiKey;
	}

	public String getSecretKey()
	{
		return secretKey;
	}

	public String getActionTitle()
	{
		return actionTitle;
	}

	public URL getActionLink()
	{
		return actionLink;
	}

	public String getUserMessage()
	{
		return userMessage;
	}

	public String getTitle()
	{
		return title;
	}

	public String getSubTitle()
	{
		return subTitle;
	}

	public String getDescription()
	{
		return description;
	}

	public URL getLinkBack()
	{
		return linkBack;
	}

	public MediaObject getMediaObject()
	{
		return mediaObject;
	}
}
