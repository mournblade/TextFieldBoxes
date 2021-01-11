package studio.carbonylgroup.textfieldboxestest;

import android.content.Context;
import android.util.AttributeSet;

import studio.carbonylgroup.textfieldboxes.TextFieldBoxes;

/**
 * Created by mangeshsambare on 1/11/21.
 */
public class MyTextFieldBoxes extends TextFieldBoxes {


    public MyTextFieldBoxes(Context context) {
        super(context);
    }

    public MyTextFieldBoxes(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextFieldBoxes(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initFont(){
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initFont();
    }
}
