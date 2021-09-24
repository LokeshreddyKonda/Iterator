package com.iterator.stickerCollection;

import com.iterator.stickerIterator.StickerIterator;

public class StickerIteratorPatternMain {

	public static void main(String[] args) {
		
		StickerCollection sample = new StickerCollection();
		StickerIterator stickerIterator = sample.getStickerIterator();
		
		while(stickerIterator.hasNextSticker()) {
			stickerIterator.nextSticker();
		}
		System.out.println(" --* Avengers End Game *--");
	}
}
