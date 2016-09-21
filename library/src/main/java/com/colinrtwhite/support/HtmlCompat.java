package com.colinrtwhite.support;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/**
 * Created by Colin White on 21/09/2016.
 */
public class HtmlCompat {
	public static Spanned fromHtml(final String source, final int flags) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			return Html.fromHtml(source, flags);
		} else {
			return Html.fromHtml(source);
		}
	}

	public static Spanned fromHtml(final String source, final int flags,
			final Html.ImageGetter imageGetter, final Html.TagHandler tagHandler) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			return Html.fromHtml(source, flags, imageGetter, tagHandler);
		} else {
			return Html.fromHtml(source, imageGetter, tagHandler);
		}
	}

	public static String toHtml(final Spanned text, final int option) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			return Html.toHtml(text, option);
		} else {
			return Html.toHtml(text);
		}
	}
}
