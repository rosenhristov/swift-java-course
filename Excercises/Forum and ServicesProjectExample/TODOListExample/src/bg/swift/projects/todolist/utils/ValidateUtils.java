package bg.swift.projects.todolist.utils;

import bg.swift.projects.todolist.entities.User;

/**
 * Created by Anatoli.
 */
public class ValidateUtils {
    private ValidateUtils() {}

    public static boolean userIsNull(User u) {
        return u == null;
    }
}
