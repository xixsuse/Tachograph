/*
 *
 *  * MIT License
 *  *
 *  * Copyright (c) [2017] [velli20]
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in all
 *  * copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  * SOFTWARE.
 *
 */

package com.velli20.tachograph.filepicker;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.velli20.tachograph.R;
import com.velli20.tachograph.views.RobotoLightTextView;

public class ViewHolderFile extends RecyclerView.ViewHolder  {
    protected ImageView mIcon;
    protected RobotoLightTextView mTitle;
    protected RobotoLightTextView mSubtitle;

    public ViewHolderFile(View itemView) {
        super(itemView);

        mIcon = (ImageView) itemView.findViewById(R.id.list_item_file_icon);
        mTitle = (RobotoLightTextView) itemView.findViewById(R.id.list_item_file_title);
        mSubtitle = (RobotoLightTextView) itemView.findViewById(R.id.list_item_file_subtitle);

    }
}
