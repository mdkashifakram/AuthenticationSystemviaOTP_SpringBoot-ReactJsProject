// craco.config.js
module.exports = {
    webpack: {
      configure: (webpackConfig, { env, paths }) => {
        // Add html-loader rule for handling .html files
        webpackConfig.module.rules.push({
          test: /\.html$/,
          use: ['html-loader'],
        });
  
        return webpackConfig;
      },
    },
  };
  