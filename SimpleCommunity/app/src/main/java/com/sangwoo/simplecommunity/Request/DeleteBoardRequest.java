package com.sangwoo.simplecommunity.Request;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class DeleteBoardRequest extends StringRequest {

    final static private String URL = "http://112.146.241.138:80/serverimg/deleteboard.php";
    private Map<String, String> parameters;

    public DeleteBoardRequest(int idx, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("idx", String.valueOf(idx));
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }

}
