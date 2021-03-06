# Navisens project for Smart Trolley Research
All text below are directly copied from Navisens' original readme. 
I have edited this repo [Navisens IndoorLocation Provider](https://github.com/IndoorLocation/navisens-indoor-location-provider-android). and adding more functionality to it.

# Navisens IndoorLocation Provider for Android

IndoorLocation Provider using MotionDNA SDK from [Navisens](https://www.navisens.com). Track phone motion using the built-in accelerometers and gyroscopes.

From the moment that you have an initial position provided by another provider (QR-Code, iBeacon, Wifi, ... ), you can use this provider to extrapolate the position based on the phone mouvements.

This provider needs to subscribe to a source IndoorLocation provider. Each time the source provider sends a new location, the Navisens provider is reset and will restart from that position to give position updates based on motion.

To use this module, sign up and get your developer key at [https://www.navisens.com]().

## Use

Instantiate the provider with an IndoorLocationProvider as source provider and your Navisens Developper Key.
```
NavisensIndoorLocationProvider navisensIndoorLocationProvider = new NavisensIndoorLocationProvider(getApplicationContext(), sourceIndoorLocationProvider, "<YOUR NAVISENS KEY>");
```

Set the provider in your Mapwize SDK:
```
mapwizePlugin.setLocationProvider(navisensIndoorLocationProvider);     
```

## Demo app

A simple demo application to test the provider is available in the /app directory.

You will need to set your credentials in NavisensIndoorLocationProviderDemoApplication and MapActivity.

Get your own key from [mapwize.io](https://www.mapwize.io). Free accounts are available.

## Contribute

Contributions are welcome. We will be happy to review your PR.

## Support

For any support with this provider, please do not hesitate to contact [support@mapwize.io](mailto:support@mapwize.io)

## License

MIT
