package com.kochchi.aseassignmentfinal;

public class Status {
    private String status_progress;
    private int status_number;

    public int getTile_color() {
        return tile_color;
    }

    public void setTile_color(int tile_color) {
        this.tile_color = tile_color;
    }

    private int tile_color;

    public Status(String status_progress, int status_number, int tile_color) {
        this.status_progress = status_progress;
        this.status_number = status_number;
        this.tile_color = tile_color;
    }

    public String getStatus_progress() {
        return status_progress;
    }

    public void setStatus_progress(String status_progress) {
        this.status_progress = status_progress;
    }

    public int getStatus_number() {
        return status_number;
    }

    public void setStatus_number(int status_number) {
        this.status_number = status_number;
    }

}
