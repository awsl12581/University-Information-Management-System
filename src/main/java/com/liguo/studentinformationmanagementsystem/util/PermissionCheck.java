package com.liguo.studentinformationmanagementsystem.util;

import com.liguo.studentinformationmanagementsystem.entity.User;

/**
 * @author 201917712
 * @date 2021/12/28 8:38
 */
public class PermissionCheck {

    public static final String NORMAL_PERMISSION = "1";
    public static final String ADVANCED_PERMISSION = "2";
    public static final String ADMINISTER_PERMISSION = "3";

    /**
     * @param user      user的权限
     * @param privilege 执行操作需要的权限
     * @return 当用户的权限大于需要的权限时，说明权限足够
     */
    public static boolean isSatisfyPermissions(User user, String privilege) {
        return Integer.parseInt(privilege) <= Integer.parseInt(user.getPrivilege());
    }
}
