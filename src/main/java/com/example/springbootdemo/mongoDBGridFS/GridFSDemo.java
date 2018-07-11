package com.example.demo.mongoDBGridFS;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GridFSDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * 1、创建数据库连接
         */
        Mongo client = new Mongo("192.168.22.246", 27017);
        //取得数据库对象
        DB db = client.getDB("mongoTest");

        String collectionName = "mongoCollectionTest";
        //创建数据库对象中GridFS集合
        GridFS gridFS = new GridFS(db, collectionName);

        /*
         * 2、上传文件
         */
        //创建测试文件，mongo 默认存在该文件
        File file = new File("F:/Java/疯狂JAVA讲义.pdf");
        FileInputStream fileInputStream = new FileInputStream(file);

        //创建gridFS文件数据流
        GridFSInputFile createFile = gridFS.createFile(fileInputStream);

        //设置文件属性
        createFile.put("filename", "123Test.pdf");
        createFile.put("contentType", "application/pdf");
        createFile.save();


        /*
         * 3、根据id查询上传文件
         */
        GridFSDBFile findOne = gridFS.findOne(new BasicDBObject("_id", createFile.getId()));
        System.out.print(findOne);

        /*
         * 4、查询所有文件列表
         * DBCursor 数据库游标
         */
        DBCursor fileList = gridFS.getFileList();
        while (fileList.hasNext()) {
            System.out.print(fileList.next());
        }

        /*
         *5、 删除文件
         */
        gridFS.remove(new BasicDBObject("_id", createFile.getId()));
        client.close();
    }
}
