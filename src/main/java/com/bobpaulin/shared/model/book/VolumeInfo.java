package com.bobpaulin.shared.model.book;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class VolumeInfo {
    private String title;
    
    private String subTitle;
    
    private String description;
    
    private String[] authors;
    
    private String previewLink;
    
    private String ratingsCount;
    
    private String averageRating;
    
    private ImageLinks imageLinks;

    public String getTitle() {
        return title;
    }

    public String getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(String ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public String getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }
    
    public ImageLinks getImageLinks() {
        return imageLinks;
    }
    
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }
    
    public Double getRatingsScore()
    {
    	return Double.parseDouble(this.ratingsCount) * Double.parseDouble(this.averageRating);
    }
}
