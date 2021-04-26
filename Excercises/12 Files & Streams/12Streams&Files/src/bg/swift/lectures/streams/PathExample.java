package bg.swift.lectures.streams;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Anatoli.
 */
public class PathExample {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\0\\1\\2"); // Microsoft Windows syntax
        //Path path = Paths.get("/home/anatoli/video"); // UNIX syntax
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,3));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
    }
}
