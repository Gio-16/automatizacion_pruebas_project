# automatizacion_pruebas_project

Proyecto de ejemplo para TA_EX_7 - Automatización de Pruebas (Giorgio Ortiz).

## Estructura
- `pom.xml` - configuración Maven con JUnit y Selenium.
- `src/main/java` - código de aplicación ejemplo.
- `src/test/java` - pruebas unitarias y placeholders de integración.
- `Jenkinsfile` - pipeline de CI ejemplo.
- `scripts/` - scripts de despliegue y rollback (simulados).

## Cómo ejecutar pruebas localmente
```bash
mvn clean test
```

## Jenkins
Se incluye un `Jenkinsfile` con stages: Build, Unit Tests, Integration Tests.

## Despliegue (simulado)
Scripts en `scripts/` para deploy/rollback en entorno `staging`.
