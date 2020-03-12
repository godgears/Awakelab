-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-03-10 17:48:18 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



DROP TABLE departamento CASCADE CONSTRAINTS;

DROP TABLE empleado CASCADE CONSTRAINTS;

CREATE TABLE departamento (
    cod_departamento  NUMBER NOT NULL,
    nombre            VARCHAR2(40) NOT NULL,
    presupuesto       NUMBER,
    gastos            NUMBER
);

ALTER TABLE departamento ADD CONSTRAINT departamento_pk PRIMARY KEY ( cod_departamento );

CREATE TABLE empleado (
    cod_empleado         NUMBER NOT NULL,
    rut                  VARCHAR2(20) NOT NULL,
    nombre               VARCHAR2(40) NOT NULL,
    apellido_paterno     VARCHAR2(20) NOT NULL,
    apellido_materno     VARCHAR2(20),
    cod_departamento_fk  NUMBER NOT NULL
);

ALTER TABLE empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( cod_empleado );

ALTER TABLE empleado
    ADD CONSTRAINT empleado_departamento_fk FOREIGN KEY ( cod_departamento_fk )
        REFERENCES departamento ( cod_departamento );

CREATE SEQUENCE departamento_cod_departamento START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER departamento_cod_departamento BEFORE
    INSERT ON departamento
    FOR EACH ROW
    WHEN ( new.cod_departamento IS NULL )
BEGIN
    :new.cod_departamento := departamento_cod_departamento.nextval;
END;
/

CREATE SEQUENCE empleado_cod_empleado_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER empleado_cod_empleado_trg BEFORE
    INSERT ON empleado
    FOR EACH ROW
    WHEN ( new.cod_empleado IS NULL )
BEGIN
    :new.cod_empleado := empleado_cod_empleado_seq.nextval;
END;
/

INSERT INTO EMPLEADO(cod_empleado, rut,nombre, apellido_paterno, apellido_materno, cod_departamento_fk)
values(EMPLEADO_COD_EMPLEADO_SEQ.NEXTVAL,'2','a','n','c','3')

//INSERT

INSERT ALL
Into DEPARTAMENTO Values ('1','Informatica','300000000','2000000')
Into DEPARTAMENTO Values ('2','Ventas','20000000','100000')
Into DEPARTAMENTO Values ('3','RRHH','60000000','1000000')
INTO DEPARTAMENTO Values ('4','Administracion','40000000','2500000')
INTO DEPARTAMENTO Values ('5','Marketing','50000000','4500000')
INTO DEPARTAMENTO Values ('6','Contabilidad','50000000','2500000')
INTO DEPARTAMENTO Values ('7','Finanzas','700000000','3500000')
SELECT * FROM dual;
INSERT ALL
Into EMPLEADO Values ('1','11.111.111-1','Jorge','Rios','Alvarado', '1')
Into EMPLEADO Values ('2','22.222.222-2','Paz','Parry','Andrade', '2')
Into EMPLEADO Values ('3','33.333.333-3','Pedro','Picapiedra','Guzman','3')
INTO EMPLEADO Values ('4','44.444.444-4','Alicia','Maravilla','Torres', '4')
INTO EMPLEADO Values ('5','55.555.555-5','Carlos','Sepulveda','Blanco','5')
INTO EMPLEADO Values ('6','66.666.666-6','Felipe','Lopez','Azul','6')
INTO EMPLEADO Values ('7','77.777.777-7','Antonio','Gutierrez','Soto','3')
INTO EMPLEADO Values ('8','88.888.888-8','Vicente','Gomez','Padilla','2')
INTO EMPLEADO Values ('9','99.999.999-9','Juan','Valdez','Cafe','5')
INTO EMPLEADO Values ('10','10.101.010-1','Valentina','Trejo','Soto','7')
SELECT * FROM dual;