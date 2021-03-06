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

package pl.orangelabs.wificalling.content.holders;

import android.view.ViewGroup;
import android.widget.TextView;

import pl.orangelabs.wificalling.R;
import pl.orangelabs.wificalling.content.VHBase;

/**
 * Created by Cookie on 2016-09-07.
 */
public class ContactDetailsCallLogVH extends VHBase
{
    public final TextView mDate;
    public final TextView mNumber;
    public final TextView mDuration;
    public final TextView mKind;

    public ContactDetailsCallLogVH(final ViewGroup v)
    {
        super(v, R.layout.recspec_contact_details_call_log);
        mDate = (TextView) itemView.findViewById(R.id.recspec_contact_details_call_log_date);
        mNumber = (TextView) itemView.findViewById(R.id.recspec_contact_details_call_log_number);
        mDuration = (TextView) itemView.findViewById(R.id.recspec_contact_details_call_log_duration);
        mKind = (TextView) itemView.findViewById(R.id.recspec_contact_details_call_log_kind);
    }
}
