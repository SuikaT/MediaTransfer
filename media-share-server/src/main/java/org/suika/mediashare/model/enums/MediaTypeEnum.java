package org.suika.mediashare.model.enums;

import lombok.Getter;

@Getter
public enum MediaTypeEnum {
    MOVIE(0, false),
    SHOW(1, true),
    ANIME(2, true);

    int code;
    // media possibly have season or not
    boolean seasons;

    private MediaTypeEnum(int code, boolean seasons) {
        this.code = code;
        this.seasons = seasons;
    }
}
