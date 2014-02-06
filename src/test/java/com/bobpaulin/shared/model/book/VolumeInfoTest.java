package com.bobpaulin.shared.model.book;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VolumeInfoTest {
	
	private VolumeInfo volumeInfo;
	
	@Before
	public void setup()
	{
		this.volumeInfo = new VolumeInfo();
	}

	@Test
	public void test() {
		this.volumeInfo.setAverageRating("2.0");
		this.volumeInfo.setRatingsCount("5");
		assertEquals("Ratings should be 10", Double.valueOf(10), this.volumeInfo.getRatingsScore());
	}

}
