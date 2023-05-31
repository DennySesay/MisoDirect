package com.dennysesay;

import com.dennysesay.folder.Folder;

import java.util.Objects;

public class File {

    private String name;
    private String suffix;

    public File(String name, String suffix) {
        this.name = name;
        this.suffix = suffix;
    }

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(name, file.name) && Objects.equals(suffix, file.suffix);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }

}
