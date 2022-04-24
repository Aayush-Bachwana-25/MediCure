package com.example.medicure;

import android.provider.BaseColumns;
import android.widget.ImageView;
import android.widget.TextView;

abstract class Person implements BaseColumns {
    public String pID=_ID;
    public ImageView imageViewPerson;
    public TextView personName;
    public TextView degree;
    public TextView mobile;
}
