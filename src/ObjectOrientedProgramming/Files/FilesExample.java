package ObjectOrientedProgramming.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        File file = new File("materials/file.txt");
        if(!file.exists()) {
            file.createNewFile();
        }

        Files.createFile(Paths.get("materials/file2.txt"));
        Files.createDirectory(Paths.get("testFolder"));

        Files.createFile(Paths.get("materials/file3.txt"));
        BasicFileAttributeView attrView =
                Files.getFileAttributeView(Paths.get("materials/file3.txt"), BasicFileAttributeView.class);
        BasicFileAttributes attributes = attrView.readAttributes();
        System.out.println(attributes.size());
        System.out.println(attributes.lastModifiedTime());

        AclFileAttributeView aclAttrView =
                Files.getFileAttributeView(Paths.get("materials/file3.txt"), AclFileAttributeView.class);
        List<AclEntry> acl = aclAttrView.getAcl();

        // TODO Here java.lang.NullPointerException. Fix it.
        for (AclEntry aclEntry : acl) {
            aclEntry.flags().forEach(System.out::println);
            aclEntry.permissions().forEach(System.out::println);
            System.out.println(aclEntry.principal().getName());
        }

        Files.readAllLines(Paths.get("materials/file3.txt"), Charset.forName("UTF-8"));


        // Copy file
        // Files.copy(Paths.get("from"), Paths.get("to"), StandardCopyOption.REPLACE_EXISTING);

        // Move file
        // Files.move(Paths.get("from"), Paths.get("to"), StandardCopyOption.REPLACE_EXISTING);
    }
}
