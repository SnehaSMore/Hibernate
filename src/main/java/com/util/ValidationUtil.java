package com.util;

mport com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

public class ValidationUtil {
    /** check validation pattern for the all controllers*/
    public static Object validate(LinkedHashMap<JFXTextField, Pattern> map, JFXButton btn) {

        for (JFXTextField key : map.keySet()) {
            Pattern pattern = map.get(key);
            if (!pattern.matcher(key.getText()).matches()) {
                addError(key,btn);
                return key;
            }
            removeError(key,btn);
        }
        return true;
    }
    /** Function of Remove error and texfield colur change */
    private static void removeError(JFXTextField textField,JFXButton btn) {
        textField.setStyle("-jfx-unfocus-color:green");
        textField.setStyle("-jfx-focus-color:green");

        btn.setDisable(false);
    }

    /** Function of Add error and texfield colur change */
    private static void addError(JFXTextField textField,JFXButton btn) {
        if(textField.getText().length()>0){
            textField.setStyle("-jfx-unfocus-color:red");
            textField.setStyle("-jfx-focus-color:red");
        }
        btn.setDisable(true);
    }
}