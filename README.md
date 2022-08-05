# CRUD

Nombre: Jesus Ortega

CI: 29891702

Correo: jesus.29891702@uru.edu

### Sobre la base de datos

Este proyecto esta hecho para una base de datos llamada crud, un usuario llamado postgres y una contraseña llamada postgres.

Estos datos deberan ser alterados antes de ejecutar el codigo, para el hacer el crud se utilizo la siguiente tabla:

```sql
create table personas (
    ci integer not null primary key,
    nombre text not null,
    apellido text not null,
    vip boolean not null
);
```

### Archivos importantes 

Las clases.java y el form se encuentran en [src/main/java/jesus_ortega/crud](https://github.com/agetro2003/CRUD_Jesus_Ortega/tree/main/src/main/java/jesus_ortega/crud)
