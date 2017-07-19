package test.bwie.com.bawaymail.view.autoview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class DetailListView extends ListView {

    public DetailListView(Context context) {
        super(context);
    }

    public DetailListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DetailListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
