package com.dennysesay;

import com.dennysesay.folder.Folder;

import java.util.ArrayList;
import java.util.Objects;

public class Preset {

    private String name;
    private ArrayList<Folder> preset;

    public Preset(String name, ArrayList<Folder> preset) {
        this.name = name;
        this.preset = preset;
    }

    public Preset() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Folder> getPreset() {
        return preset;
    }

    public void setPreset(ArrayList<Folder> preset) {
        this.preset = preset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preset preset1 = (Preset) o;
        return Objects.equals(name, preset1.name) && Objects.equals(preset, preset1.preset);
    }

    @Override
    public String toString() {
        return "Preset{" +
                "name='" + name + '\'' +
                ", preset=" + preset +
                '}';
    }

}
