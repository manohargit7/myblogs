package com.myblogs.service.impl;
import com.myblogs.payload.PostDto;
import lombok.Data;
import java.util.List;


@Data
public class PostResponse  {
    private List<PostDto> content;
    private int PageNo;
    private int PageSize;
    private Long totalElements;
    private int totalPages;
    private boolean isLast;

}
