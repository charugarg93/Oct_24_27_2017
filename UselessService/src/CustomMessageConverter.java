package com.example.demo;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class CustomMessageConverter extends AbstractHttpMessageConverter<Person> {

    @Override
    protected boolean supports(Class<?> aClass) {
        System.out.println("***supports " + aClass.getName());
        System.out.println(Person.class.equals(aClass));
        if(Person.class.equals(aClass))
            return true;
        return false;
    }

    @Override
    protected Person readInternal(Class<? extends Person> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        System.out.println("***readInternal Called with  ");
        return null;
    }

    public static final MediaType MEDIA_TYPE = new MediaType("text", "plain", Charset.forName("utf-8"));

    public CustomMessageConverter() {
        super(MEDIA_TYPE);
    }

    @Override
    protected void writeInternal(Person person, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        System.out.println("***writeInternal Called with  " + person);
        String output = "{";
        output += "\"person\":" + "\"" +person.getName() + "\"";
        output += "}";
        httpOutputMessage.getHeaders().setContentType(MEDIA_TYPE);
        final OutputStream out = httpOutputMessage.getBody();

        out.write(output.getBytes(Charset.forName("utf-8")));
        out.close();
    }
}
