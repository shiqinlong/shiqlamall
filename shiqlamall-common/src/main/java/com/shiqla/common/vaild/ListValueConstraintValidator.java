package com.shiqla.common.vaild;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-15
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer>
{


    Set set = new HashSet();

    @Override
    public boolean isValid (Integer integer,
                            ConstraintValidatorContext constraintValidatorContext)
    {
        if (set.contains(1) || set.contains(0))
            return true;
        else
            return false;
    }

    @Override
    public void initialize (ListValue constraintAnnotation)
    {
        int[] vals = constraintAnnotation.vals();
        for (int i = 0 ;i < vals.length;i++){
            set.add(vals[i]);
        }
    }
}
