package com.coderpage.wubinput.view.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.coderpage.wubinput.R;
import com.coderpage.wubinput.model.Wubi;
import com.coderpage.wubinput.view.activity.PracticeInputActivity;
import com.coderpage.wubinput.view.activity.TestInputActivity;

/**
 * @author abner-l
 * @since 2015-09-03
 */
public class SelectDialog extends AlertDialog.Builder {
    private AlertDialog dialog;
    private int mode;
    private Context context;

    public SelectDialog(Context context, int mode) {
        super(context);
        this.mode = mode;
        this.context = context;
        initSettings();
    }

    private void initSettings() {

        int itemsSrcID;
        if (mode == Wubi.TypingMode.PRACTICE_SINGLE_WORD || mode == Wubi.TypingMode.TEST_SINGLE_WORD) {
            itemsSrcID = R.array.single_input_selects;
        } else {
            itemsSrcID = R.array.article_input_selects;
        }

        setItems(itemsSrcID, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (mode == Wubi.TypingMode.PRACTICE_SINGLE_WORD) {
                    switch (which) {
                        case 0:
                            startActivityPracticeSingle(Wubi.SingleLevelType.LEVEL_1);
                            break;
                        case 1:
                            startActivityPracticeSingle(Wubi.SingleLevelType.LEVEL_2);
                            break;
                        case 2:
                            startActivityPracticeSingle(Wubi.SingleLevelType.LEVEL_3);
                            break;
                        default:
                            startActivityPracticeSingle(Wubi.SingleLevelType.RANDOW);
                            break;

                    }
                } else if (mode == Wubi.TypingMode.PRACTICE_ARTICLE){
                    switch (which) {
                        case 0:
                            startActivityPracticeArticle(1);
                            break;
                        case 1:
                            startActivityPracticeArticle(2);
                            break;
                        case 2:
                            startActivityPracticeArticle(3);
                            break;
                        case 3:
                            startActivityPracticeArticle(4);
                            break;
                        case 4:
                            startActivityPracticeArticle(5);
                            break;
                        case 5:
                            startActivityPracticeArticle(6);
                            break;
                        case 6:
                            startActivityPracticeArticle(7);
                            break;
                        case 7:
                            startActivityPracticeArticle(8);
                            break;
                        case 8:
                            startActivityPracticeArticle(9);
                            break;
                        case 9:
                            startActivityPracticeArticle(10);
                            break;
                        case 10:
                            startActivityPracticeArticle(11);
                            break;
                        case 11:
                            startActivityPracticeArticle(12);
                            break;
                        case 12:
                            startActivityPracticeArticle(13);
                            break;
                        case 13:
                            startActivityPracticeArticle(14);
                            break;
                        case 14:
                            startActivityPracticeArticle(15);
                            break;
                        case 15:
                            startActivityPracticeArticle(16);
                            break;
                        case 16:
                            startActivityPracticeArticle(17);
                            break;
                        case 17:
                            startActivityPracticeArticle(18);
                            break;
                        case 18:
                            startActivityPracticeArticle(19);
                            break;
                        default:
                            startActivityPracticeArticle(20);
                            break;

                    }
                } else if (mode == Wubi.TypingMode.TEST_SINGLE_WORD){
                    switch (which) {
                        case 0:
                            startActivityTestSingle(Wubi.SingleLevelType.LEVEL_1);
                            break;
                        case 1:
                            startActivityTestSingle(Wubi.SingleLevelType.LEVEL_2);
                            break;
                        case 2:
                            startActivityTestSingle(Wubi.SingleLevelType.LEVEL_3);
                            break;
                        default:
                            startActivityTestSingle(Wubi.SingleLevelType.RANDOW);
                            break;

                    }
                } else {
                    switch (which) {
                        case 0:
                            startActivityTestArticle(1);
                            break;
                        case 1:
                            startActivityTestArticle(2);
                            break;
                        case 2:
                            startActivityTestArticle(3);
                            break;
                        case 3:
                            startActivityTestArticle(4);
                            break;
                        case 4:
                            startActivityTestArticle(5);
                            break;
                        case 5:
                            startActivityTestArticle(6);
                            break;
                        case 6:
                            startActivityTestArticle(7);
                            break;
                        case 7:
                            startActivityTestArticle(8);
                            break;
                        case 8:
                            startActivityTestArticle(9);
                            break;
                        case 9:
                            startActivityTestArticle(10);
                            break;
                        case 10:
                            startActivityTestArticle(11);
                            break;
                        case 11:
                            startActivityTestArticle(12);
                            break;
                        case 12:
                            startActivityTestArticle(13);
                            break;
                        case 13:
                            startActivityTestArticle(14);
                            break;
                        case 14:
                            startActivityTestArticle(15);
                            break;
                        case 15:
                            startActivityTestArticle(16);
                            break;
                        case 16:
                            startActivityTestArticle(17);
                            break;
                        case 17:
                            startActivityTestArticle(18);
                            break;
                        case 18:
                            startActivityTestArticle(19);
                            break;
                        default:
                            startActivityTestArticle(20);
                            break;

                    }
                }
            }
        });

        this.dialog = create();
    }

    private void startActivityPracticeSingle(int select) {
        Intent intent = new Intent(context, PracticeInputActivity.class);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_MODE, Wubi.TypingMode.PRACTICE_SINGLE_WORD);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_SELECT, select);
        context.startActivity(intent);
    }

    private void startActivityPracticeArticle(int select) {
        Intent intent = new Intent(context, PracticeInputActivity.class);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_MODE, Wubi.TypingMode.PRACTICE_ARTICLE);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_SELECT, select);
        context.startActivity(intent);
    }

    private void startActivityTestSingle(int select) {
        Intent intent = new Intent(context, TestInputActivity.class);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_MODE, Wubi.TypingMode.TEST_SINGLE_WORD);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_SELECT, select);
        context.startActivity(intent);
    }

    private void startActivityTestArticle(int select) {
        Intent intent = new Intent(context, TestInputActivity.class);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_MODE, Wubi.TypingMode.TEST_ARTICLE);
        intent.putExtra(PracticeInputActivity.BUNDLE_KEY_SELECT, select);
        context.startActivity(intent);
    }

    public void showMe() {
        dialog.show();
    }

}