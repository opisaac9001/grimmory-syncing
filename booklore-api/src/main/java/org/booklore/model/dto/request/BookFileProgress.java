package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotNull;

public record BookFileProgress(
        @NotNull Long bookFileId,
        String positionData,
        String positionHref,
        Float positionProgression,
        @NotNull Float progressPercent,
        String ttsPositionCfi) {
}
