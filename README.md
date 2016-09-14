# jee7-sample01
Ejemplo de aplicacion web jee7 con Primefaces

Debería funcionar sin problemas teniendo instalado:
- Editor recomendado "Netbeans 8.1" (sino puede ser la última versión de eclipse pero con el profile JavaEE)
- git
- maven
- payara http://www.payara.fish/downloads (profile full version 163).

Luego supongamos que vamos a trabajar en el archivo "C:\users\martin\desarrollos".

Ingresar por linea de comando a "C:\users\martin\desarrollos", 
Luego allí ejecutar allí el comando "git clone https://github.com/mart-dominguez/jee7-sample01.git"

te va a crear el diretorio "jee7-sample01".

Entras a ese directorio: "cd jee7-sample01" y ejecutás "mvn clean install" (se supone que maven esta funcionando bien, para eso verficia que la variable de entorno path tenga en su contenido el direcotorio bin de maven y creo que también necesitas el JAVA_HOME).

Si ejecuta bien (la primera vez demora un poco y necesitas conexión a internet), en el directorio target vas a tener un archivo "ejemplo-1.0-SNAPSHOT.war". 

Luego inicia payara y entra a la consola (localhost:4848) y desplegás el war.

Luego en el navegador ejecuta localhost:8080/ejemplo-1.0-SNAPSHOT/ y tenés un ejemplo de aplicacion).

Con Netbeans directamente, a ser un proyecto maven te permite abrirlo y si tenés el servidor payara configurado en netbeans (se configura como un servidor glassfish), lo podés ejecutar desde ahi.

