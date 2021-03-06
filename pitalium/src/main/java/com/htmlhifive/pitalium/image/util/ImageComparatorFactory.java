/*
 * Copyright (C) 2015-2016 NS Solutions Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.htmlhifive.pitalium.image.util;

import com.htmlhifive.pitalium.image.model.CompareOption;

/**
 * 比較方法に対応するImageComparatorを生成するファクトリクラス
 */
public final class ImageComparatorFactory {

	private static final ImageComparatorFactory INSTANCE = new ImageComparatorFactory();

	/**
	 * コンストラクタ
	 */
	private ImageComparatorFactory() {
	}

	/**
	 * ImageComparatorFactoryのインスタンスを取得します。
	 * 
	 * @return ImageComparatorFactoryのインスタンス（シングルトン）
	 */
	public static ImageComparatorFactory getInstance() {
		return INSTANCE;
	}

	/**
	 * 比較方法に対応したImageComparatorを取得します。
	 * 
	 * @param options 比較方法（比較オプション）
	 * @return ImageComparatorオブジェクト
	 */
	public ImageComparator getImageComparator(CompareOption[] options) {
		// TODO implements ImageComparator for each options.
		return new DefaultImageComparator();
	}
}
