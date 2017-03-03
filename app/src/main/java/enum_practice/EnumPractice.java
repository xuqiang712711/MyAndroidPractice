package enum_practice;

import com.android.miiadnroidframework.mutils.MiiLogUtils;

/**
 * 枚举练习
 * Created by beryl on 17/3/2.
 */
public class EnumPractice {
    public enum ColorEnum {
        //红色
        Red,
        //黄色
        Yellow,
        //白色
        White,
        //蓝色
        Blue,
        //绿色
        Green,
        //灰色
        Gray,
        //黑色
        Black,
        //粉红
        Pink,
        //紫色
        Purple,
        //玫红色
        Rose,
        //褐色
        Brown,
        //金色
        Golden
    }

    /**
     * 打印颜色
     * @param color 颜色
     */
    public void printColor(ColorEnum color) {
        switch (color) {
            case Red:
                MiiLogUtils.i(color + "=" + "红色");
                break;
            case Yellow:
                MiiLogUtils.i(color + "=" + "黄色");
                break;
            case White:
                MiiLogUtils.i(color + "=" + "白色");
                break;
            case Blue:
                MiiLogUtils.i(color + "=" + "蓝色");
                break;
            case Green:
                MiiLogUtils.i(color + "=" + "绿色");
                break;
            case Gray:
                MiiLogUtils.i(color + "=" + "灰色");
                break;
            case Black:
                MiiLogUtils.i(color + "=" + "黑色");
                break;
            case Pink:
                MiiLogUtils.i(color + "=" + "粉红色");
                break;
            case Purple:
                MiiLogUtils.i(color + "=" + "紫色");
                break;
            case Rose:
                MiiLogUtils.i(color + "=" + "玫红色");
                break;
            case Brown:
                MiiLogUtils.i(color + "=" + "褐色");
                break;
            case Golden:
                MiiLogUtils.i(color + "=" + "金黄色");
                break;
        }
    }
}
