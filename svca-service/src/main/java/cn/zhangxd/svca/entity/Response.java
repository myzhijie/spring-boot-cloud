package cn.zhangxd.svca.entity;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {

    @Getter
    @Setter
    @NonNull
    private int code;

    @Getter @Setter @NonNull
    private String msg;

    @Getter @Setter
    private T data;
}
