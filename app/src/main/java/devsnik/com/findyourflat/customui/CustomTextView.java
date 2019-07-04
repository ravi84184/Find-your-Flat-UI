package devsnik.com.findyourflat.customui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import devsnik.com.findyourflat.Constants;
import devsnik.com.findyourflat.R;


public class CustomTextView extends android.support.v7.widget.AppCompatTextView {


    private Context mContext;
    private String mFont;

    public CustomTextView(Context context) {
        super(context, null);
        mContext = context;
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomTextView,
                0, 0);
        try {
            mFont = a.getString(R.styleable.CustomTextView_fontName);
        } finally {
            a.recycle();
        }
        init();
    }

    public void init() {
        if (mFont != null) {
            Typeface tf;
            if (mFont.equals(mContext.getString(R.string.font_roboto_bold))) {
                tf = Typeface.createFromAsset(mContext.getAssets(), Constants.sourceRobotoBold);
            } else if (mFont.equals(mContext.getString(R.string.font_roboto_light))) {
                tf = Typeface.createFromAsset(mContext.getAssets(), Constants.sourceRobotoLight);
            } else {
                tf = Typeface.createFromAsset(mContext.getAssets(), Constants.sourceRobotoRegular);
            }


            setTypeface(tf, Typeface.NORMAL);
        }
    }
}
