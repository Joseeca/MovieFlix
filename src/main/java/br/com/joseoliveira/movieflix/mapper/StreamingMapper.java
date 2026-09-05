package br.com.joseoliveira.movieflix.mapper;

import br.com.joseoliveira.movieflix.controller.request.StreamingRequest;
import br.com.joseoliveira.movieflix.controller.response.StreamingResponse;
import br.com.joseoliveira.movieflix.entity.Streaming;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StreamingMapper {

    public static Streaming toStreaming(StreamingRequest streamingRequest) {
        return Streaming.builder().name(streamingRequest.name()).build();
    }

    public static StreamingResponse toStreamingResponse(Streaming streaming) {
        return StreamingResponse
                .builder()
                .id(streaming.getId())
                .name(streaming.getName())
                .build();
    }
}
