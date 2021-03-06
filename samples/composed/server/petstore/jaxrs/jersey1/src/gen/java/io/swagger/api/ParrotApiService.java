package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
public abstract class ParrotApiService {
      public abstract Response addParrot(Body2 body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getParrots(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateParrots(Body1 body,SecurityContext securityContext)
      throws NotFoundException;
}
