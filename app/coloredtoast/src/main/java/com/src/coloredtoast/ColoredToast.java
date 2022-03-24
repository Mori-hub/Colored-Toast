package com.src.coloredtoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ColoredToast {

    Context context;
    LayoutInflater li;
    View toastView;
    TextView text;
    ImageView icon;

    @SuppressLint("InflateParams")
    public ColoredToast(Context context) {
        this.context = context;
        // Define Elements of Toast
        this.li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.toastView = li.inflate(R.layout.toast_hint_layout, null);
        this.text = toastView.findViewById(R.id.tv_toast);
        this.icon = toastView.findViewById(R.id.icon_toast);
    }

    public Toast customs(String textMessage, int length, int colorText, int colorBack, int colorTintArgb, int iconDrawable, int gravity) {
        Toast toast = Toast.makeText(context, textMessage, length);

        // Give Value to them
        if (iconDrawable != 0)
            icon.setImageResource(iconDrawable);
        if (colorText != 0)
            text.setTextColor(context.getResources().getColor(colorText));
        if (colorBack != 0)
            toastView.setBackgroundResource(colorBack);
        if (colorTintArgb != 0)
            toastView.setBackgroundTintList(ColorStateList.valueOf(colorTintArgb));
        text.setText(textMessage);
        toast.setView(toastView);
        if (gravity != 0)
            toast.setGravity(gravity, 0, 0);
        return toast;
    }

    public Toast success(String textMessage, int length) {
        Toast toast = Toast.makeText(context, textMessage, length);
        // Values
        icon.setImageResource(android.R.drawable.ic_menu_myplaces);
        text.setTextColor(context.getResources().getColor(android.R.color.background_light));
        text.setText(textMessage);
        toastView.setBackgroundTintList(ColorStateList.valueOf(Color.argb(255, 132, 204, 0)));
        toastView.setBackgroundResource(R.drawable.option);
        toast.setView(toastView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }

    public Toast fail(String textMessage, int length) {
        Toast toast = Toast.makeText(context, textMessage, length);

        // Values
        icon.setImageResource(android.R.drawable.ic_menu_info_details);
        text.setTextColor(context.getResources().getColor(android.R.color.background_light));
        text.setText(textMessage);
        // toastView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        toastView.setBackgroundTintList(ColorStateList.valueOf(Color.argb(255, 255, 0, 0)));
        toastView.setBackgroundResource(R.drawable.option);
        toast.setView(toastView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }

    public Toast warning(String textMessage, int length) {
        Toast toast = Toast.makeText(context, textMessage, length);


        // Values
        icon.setImageResource(android.R.drawable.stat_sys_warning);
        text.setTextColor(context.getResources().getColor(android.R.color.background_light));
        text.setText(textMessage);
        // toastView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        toastView.setBackgroundTintList(ColorStateList.valueOf(Color.argb(255, 255, 178, 0)));
        toastView.setBackgroundResource(R.drawable.option);
        toast.setView(toastView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }

    public Toast info(String textMessage, int length) {
        Toast toast = Toast.makeText(context, textMessage, length);

        // Values
        icon.setImageResource(android.R.drawable.ic_dialog_info);
        text.setTextColor(context.getResources().getColor(android.R.color.background_light));
        text.setText(textMessage);
        // toastView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        toastView.setBackgroundTintList(ColorStateList.valueOf(Color.argb(255, 0, 99, 251)));
        toastView.setBackgroundResource(R.drawable.option);
        toast.setView(toastView);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }
}
