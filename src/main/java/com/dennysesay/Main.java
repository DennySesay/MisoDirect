package com.dennysesay;

import com.dennysesay.folder.FeatureFolder;
import com.dennysesay.folder.Folder;

public class Main {
    public static void main(String[] args) {
        String BANNER = """
                             __  _______           ____  _                __\s
                            /  |/  /  _/________  / __ \\(_)_______  _____/ /_
                           / /|_/ // // ___/ __ \\/ / / / / ___/ _ \\/ ___/ __/
                          / /  / // /(__  ) /_/ / /_/ / / /  /  __/ /__/ /_ \s
                         /_/  /_/___/____/\\____/_____/_/_/   \\___/\\___/\\__/ \s
                         """;


        System.out.println(BANNER);
        System.out.println("Main.main Here");
        System.out.println(Preset.class);
        System.out.println(Folder.class);
        System.out.println(FeatureFolder.class);
        System.out.println(File.class);
        System.out.println(InputReader.class);
    }

}
