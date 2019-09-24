package com.example.test;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import java.net.URL;


public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        startActivity(new Intent(this,MainActivity.class));
        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        finish();
    }

    private class UserThread extends AsyncTask {
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
        }

        @Override
        protected Long doInBackground(URL url){
            // 전달된 URL 사용 작업
            return 0;
        }

        @Override
        protected void onProgressUpdate(Integer progress){
            // 파일 다운로드 퍼센티지 표시
        }

        @Override
        protected void onPostExecute(Long result){
            // doInBackground에서 받아온 return값 사용
        }
    }
}