package com.iterator.stickerCollection;

import com.iterator.stickerIterator.StickerIterator;

public class StickerCollectionIterate implements StickerIterator{

	int iterate;
	
	private String Stickers[] = {"CaptainAmerica","CaptainMarvel","Ironman","Hulk","Thor","Loki","AntMan","BlackPanther","Thanos"};
	
	@Override
	public boolean hasNextSticker() {
		if(iterate < Stickers.length) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object nextSticker() {
		if(this.hasNextSticker()) {
			System.out.println(Stickers[iterate]);
			return Stickers[iterate++];
		}		
		return null;
	}

}
