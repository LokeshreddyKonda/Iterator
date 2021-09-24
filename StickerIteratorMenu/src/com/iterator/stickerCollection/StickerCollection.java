package com.iterator.stickerCollection;

import com.iterator.stickerContainer.StickerContainer;
import com.iterator.stickerIterator.StickerIterator;

public class StickerCollection implements StickerContainer{

	@Override
	public StickerIterator getStickerIterator() {
		return new StickerCollectionIterate();
	}

}
