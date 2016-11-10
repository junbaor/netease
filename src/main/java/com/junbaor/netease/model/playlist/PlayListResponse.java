package com.junbaor.netease.model.playlist;

import java.util.List;

public class PlayListResponse {

    private boolean more;
    private List<Playlist> playlist;
    private int code;

    public void setMore(boolean more) {
        this.more = more;
    }

    public boolean getMore() {
        return more;
    }

    public void setPlaylist(List<Playlist> playlist) {
        this.playlist = playlist;
    }

    public List<Playlist> getPlaylist() {
        return playlist;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}