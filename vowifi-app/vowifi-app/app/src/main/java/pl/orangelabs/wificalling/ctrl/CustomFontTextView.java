/*
 * Copyright (C) 2017 Orange Polska SA
 *
 * This file is part of WiFi Calling.
 *
 * WiFi Calling is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  WiFi Calling is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty o
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package pl.orangelabs.wificalling.ctrl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import pl.orangelabs.wificalling.R;
import pl.orangelabs.wificalling.util.flavoured.FontHandler;

/**
 * @author F
 */

public class CustomFontTextView extends AppCompatTextView
{
    public CustomFontTextView(final Context context)
    {
        super(context);
        init(context, null);
    }

    public CustomFontTextView(final Context context, final AttributeSet attrs)
    {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomFontTextView(final Context context, final AttributeSet attrs, final int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(final Context context, final AttributeSet attrs)
    {
        final TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomFontTextView);
        boolean useHeaderFont = false;
        if (ta != null)
        {
            useHeaderFont = ta.getBoolean(R.styleable.CustomFontTextView_useHeaderFont, false);
            ta.recycle();
        }
        final boolean useBold = !useHeaderFont && getTypeface() != null && (getTypeface().getStyle() & Typeface.BOLD) > 0;
        FontHandler.setFont(this, useHeaderFont, useBold);
    }
}
